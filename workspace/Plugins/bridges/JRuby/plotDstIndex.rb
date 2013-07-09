#!/usr/bin/env jruby
require 'java'
java_import org.jfree.chart.chartfactory
java_import org.jfree.chart.ChartFrame
java_import org.iugonet.www.Aplot
java_import org.iugonet.www.Tplot
java_import org.iugonet.www.DstIndex
java_import java.lang.String

strUrl="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
dstIndex=DstIndex()
timeSeriesCollection=dstIndex.loadData(strUrl)

chart=jfree.chart.ChartFactory.createTimeSeriesChart(lang.String("Dst Index"),lang.String("Time"),lang.String("Dst Index [nT]"),timeSeriesCollection,lang.Boolean("FALSE"),lang.Boolean("FALSE"),lang.Boolean("TRUE"))
frame=jfree.chart.ChartFrame(lang.String("Simple TimeSeries Chart"),chart)
frame.pack()
frame.setVisible=true
