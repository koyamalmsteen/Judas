#!/usr/bin/env jruby
include Java
require_relative "/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar"
require_relative "/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar"
require_relative "/home/iugonet/Judas/lib/Aplot.jar"
require_relative "/home/iugonet/Judas/lib/Tplot.jar"
require_relative "/home/iugonet/Judas/plugins/DstIndex.jar"
java_import javax.swing.JFrame
java_import org.jfree.chart.ChartFactory
java_import org.jfree.chart.ChartFrame
java_import java.lang.String
java_import java.lang.Boolean
java_import org.iugonet.www.DstIndex

strUrl="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
dstIndex=DstIndex.new()
timeSeriesCollection=dstIndex.loadData(strUrl)

chart=ChartFactory.createTimeSeriesChart(String("Dst Index"),String("Time"),String("Dst Index [nT]"),timeSeriesCollection,FALSE,FALSE,TRUE)
#frame=ChartFrame.new_with_sig('Lorg.jfree.chart.ChartFrame',String("Simple TimeSeries Chart"),chart)
#.java_class.constructor(String("Simple TimeSeries Chart"),null)
frame.pack()
frame.setVisible=true
