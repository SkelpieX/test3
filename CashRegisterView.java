//View Swing

import javax.swing.*;

public class CashRegisterView {
    private JFrame frame;
    private JLabel nameLabel;
    private JLabel priceLabel;

    public CashRegisterView() {
        frame = new JFrame("Cash Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        nameLabel = new JLabel("Product Name: ");
        priceLabel = new JLabel("Product Price: ");
        panel.add(nameLabel);
        panel.add(priceLabel);

        frame.add(panel);
    }

    public void displayProduct(Product product) {
        if (product != null) {
            nameLabel.setText("Product Name: " + product.getName());
            priceLabel.setText("Product Price: " + product.getPrice());
        }
    }

    public void show() {
        frame.setVisible(true);
    }
}
