include Java

# Add jar Path
$CLASSPATH << '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/DataLoader_rev/bin'
#require '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/lib/external/DataLoader_rev.jar'
require '/home/iugonet/Judas/lib/external/Tplot.jar'
require '/home/iugonet/Judas/lib/external/jcommon-1.0.17.jar'
require '/home/iugonet/Judas/lib/external/jfreechart-1.0.14.jar'

# Load Dst Index
arg0='http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410'
dstindexload=org.iugonet.www.DstIndexLoad.new
array=dstindexload.LoadData(arg0)

# Convert from java to ruby variables
arr=array.to_a
