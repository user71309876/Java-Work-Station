import javax.swing.JOptionPane;

class GUI {
    public static void main(String[] args) {

        String name=JOptionPane.showInputDialog("Enter your name");
        // 텍스트를 넣을 수 있는 창이 생긴다
        JOptionPane.showMessageDialog(null, "Hello "+name);
        // 텍스트가 나오는 창이 생긴다

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //showInputDialog는 String형으로 값을 주기 때문에
        //값을 넣을 때 int형으로 바꿔주어야 한다(Integer.parseInt(바꿔지는 값))
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
        
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");
    }

}