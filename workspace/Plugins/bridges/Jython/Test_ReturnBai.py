import sys

# Add jar path
sys.path.append("/home/iugonet/Judas/workspace/DataLoader/bridges/Java_for_test/Bai/bin")
import org.iugonet.www.ReturnBai

# Call ReturnBai
x=100
returnbai=org.iugonet.www.ReturnBai()
y=returnbai.Bai(x)
print y

