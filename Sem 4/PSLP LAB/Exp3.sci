clear all;
disp("Name : VISHAL KUMAR");
disp("Roll No. 14814802722");
disp("Enter no. of observation");
n=input('\');
disp("Enter values of x");
for i=1:n
X(1,i)=input('\');
end
disp("Enter no. of frequencies");
for j=1:n
F(1,j)=input('\');
end
disp("Mean of the distribution is");
MEA= sum(F.*X)/sum(F);
disp(MEA);
p=MEA/n;
EF=sum(F)*binomial(p,n-1);
disp("Given Frequencies");
disp(F);
disp("Expected Frequencies");
disp(EF);
plot2d3(0:n-1,F);
plot2d(0:n-1,EF);
