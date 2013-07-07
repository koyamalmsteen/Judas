% Test for DstIndexLoad
%

% Add dynamic java path
clear java;
javaaddpath '/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar';
javaaddpath '/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar';
javaaddpath '/home/iugonet/Judas/lib/external/Tplot.jar';
javaaddpath '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/DataLoader_rev/bin';

% Call DstIndexLoad.class
arg0='http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410';
h=org.iugonet.www.DstIndexLoad;
array=javaMethod('LoadData', h, arg0);

date=datevec(datenum(1970, 1, 1, 0, 0, array(:,1)));
dst=array(:,2);
plot(date(:,3)+date(:,4)/24, dst)

