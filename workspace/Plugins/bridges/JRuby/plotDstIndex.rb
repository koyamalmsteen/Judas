#!/usr/bin/env jruby
include Java
require "/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar"
require "/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar"
require "/home/iugonet/Judas/lib/Aplot.jar"
require "/home/iugonet/Judas/lib/Tplot.jar"
require "/home/iugonet/Judas/plugins/DstIndex.jar"
java_import org.jfree.chart.ChartFactory
java_import java.lang.String
java_import org.iugonet.www.DstIndex

strUrl="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
dstIndex=Java::dstindex.dstindex()
#timeSeriesCollection=Java::dstIndex.loaddata(strUrl)

chart=Java::ChartFactory.createTimeSeriesChart(Java::java.lang.String("Dst Index"),Java::java.lang.String("Time"),Java::java.lang.String("Dst Index [nT]"),timeSeriesCollection,Boolean("FALSE"),Java::Boolean("FALSE"),Java::Boolean("TRUE"))
frame=jfree.chart.ChartFrame(java.lang.String("Simple TimeSeries Chart"),chart)
frame.pack()
frame.setVisible=true
