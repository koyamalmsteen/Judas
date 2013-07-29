#!/usr/bin/env jython
import sys

# Add jar path
sys.path.append("/home/iugonet/Judas/lib/Tplot.jar")
sys.path.append("/home/iugonet/Judas/lib/Aplot.jar")
sys.path.append("/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar")
sys.path.append("/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar")
sys.path.append("/home/iugonet/Judas/plugins/DstIndex.jar")

from org import jfree
from org.iugonet.www import Aplot
from org.iugonet.www import Tplot
from org.iugonet.www import DstIndex
from java import lang

strUrl="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
dstIndex=DstIndex()
timeSeriesCollection=dstIndex.loadData(strUrl)

chart=jfree.chart.ChartFactory.createTimeSeriesChart(lang.String("Dst Index"),lang.String("Time"),lang.String("Dst Index [nT]"),timeSeriesCollection,lang.Boolean("FALSE"),lang.Boolean("FALSE"),lang.Boolean("TRUE"))
frame=jfree.chart.ChartFrame(lang.String("Simple TimeSeries Chart"),chart)
frame.pack()
frame.setVisible(lang.Boolean("TRUE"))
