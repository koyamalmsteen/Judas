import sys

# Add jar path
sys.path.append("/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/DataLoader_rev/bin")
sys.path.append("/home/iugonet/Judas/lib/external/Tplot.jar")
sys.path.append("/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar")
sys.path.append("/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar")

import org.iugonet.www.DstIndexLoad

# Call DstIndexLoad
arg0="http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410"
dstindexload=org.iugonet.www.DstIndexLoad()
array=dstindexload.LoadData(arg0)
print array

