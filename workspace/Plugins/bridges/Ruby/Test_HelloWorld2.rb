include Java

# Add class path to CLASSPATH
$CLASSPATH << '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/HelloWorld/bin'
java_import 'org.iugonet.www.HelloWorld'

# Run HelloWorld.
org.iugonet.www.HelloWorld.main([])


