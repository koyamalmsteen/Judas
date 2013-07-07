% Test for HelloWorld
%

% Add dynamic java path
clear java;
javaaddpath '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/HelloWorld/bin'

% Call HelloWorld.class
h=hoge.hoge.com.HelloWorld;
javaMethod('main', h, '');

