clear java;

%===== Set java path =====%
javaaddpath '/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar';
javaaddpath '/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar';
javaaddpath '/home/iugonet/Judas/lib/Aplot.jar';
javaaddpath '/home/iugonet/Judas/lib/Tplot.jar';
javaaddpath '/home/iugonet/Judas/plugins/DstIndex.jar';

strURL='http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410';
dstIndex=org.iugonet.www.DstIndex;
tsCollection=javaMethod('loadData', dstIndex, strURL);


%===== Convert TimeSeriesCollection to MATLAB vector =====;
nrow=tsCollection.getItemCount(0);  % 744 (=31*24)
ncol=tsCollection.getSeriesCount;  % (=1)
data=zeros(nrow,ncol+1);
sec=zeros(nrow,1);

%---- Insert time -----;
timeZone=java.util.TimeZone.getTimeZone('UTCEtc');
cal=java.util.Calendar.getInstance(timeZone);
timeSeries=tsCollection.getSeries(0);
for irow=1:nrow
    sec(irow)=timeSeries.getTimePeriod(irow-1).getFirstMillisecond(cal)/1000;
end
data(:,1)=datenum(1970, 1, 1, 0, 0, sec);

%---- Insert data -----;
for icol=1:ncol
    timeSeries=tsCollection.getSeries(icol-1);
    for irow=1:nrow
        data(irow,ncol+1)=timeSeries.getValue(irow-1).doubleValue;
    end
end

plot(data(:,1), data(:,2))
datetick('x', 'mmm-yyyy')
