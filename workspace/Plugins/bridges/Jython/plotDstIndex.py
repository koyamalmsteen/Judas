#!/usr/bin/env jython
from org import jfree
from org.iugonet.www import Aplot
from org.iugonet.www import Tplot
from org.iugonet.www import DstIndex
from java import lang
from java import net

strUrl="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
uri=net.URI(strUrl)
dstIndex=DstIndex()
#timeSeriesCollection=dstIndex.load(strUrl)
timeSeriesCollection=dstIndex.load(uri)

chart=jfree.chart.ChartFactory.createTimeSeriesChart(lang.String("Dst Index"),lang.String("Time"),lang.String("Dst Index [nT]"),timeSeriesCollection,lang.Boolean("FALSE"),lang.Boolean("FALSE"),lang.Boolean("TRUE"))
frame=jfree.chart.ChartFrame(lang.String("Simple TimeSeries Chart"),chart)
frame.pack()
frame.setVisible(lang.Boolean("TRUE"))
