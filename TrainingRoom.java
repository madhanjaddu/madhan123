class TrainingRoom
{
String courseName = "java";
int time = 1130;
public static void main(String[] args)
{
TrainingRoom trainer = new TrainingRoom();
trainer.sentMessage();
System.out.println(trainer.courseName);
System.out.println(trainer.time);
}
void sentMessage()
{
int time = 5;
System.out.println("will be late" + time);
}
} 
