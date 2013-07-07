include Java

# Add class path to CLASSPATH
$CLASSPATH << '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/Bai/bin'
java_import 'org.iugonet.www.ReturnBaiTest'
java_import 'org.iugonet.www.ReturnBai'

# Run ReturnBaiTest
org.iugonet.www.ReturnBaiTest.main([])

# Run ReternBai
x=100
returnbai=org.iugonet.www.ReturnBai.new
y=returnbai.Bai(x)
puts y

