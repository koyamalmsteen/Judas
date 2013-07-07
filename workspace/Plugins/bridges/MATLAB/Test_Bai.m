% Test for ReturnBai (y=2*x)
%

% Add dynamic java path
clear java;
javaaddpath '/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/Bai/bin';

% Call ReturnBai.class
h=org.iugonet.www.ReturnBai;
x=10;
y=javaMethod('Bai', h, x);

disp(['y = ', num2str(y)]);
