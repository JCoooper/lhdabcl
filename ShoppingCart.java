import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

public class ShoppingCart implements Cart {

	private int quan;
	private double tote;
	private double tax;
	private double ship;
	private String result;
	private String pricee;

	ArrayList<SelectedItem> index = new ArrayList<SelectedItem>();

	public void addItem(SelectedItem newItem) {
		for (int i = 0; i < index.size(); i++) {
			if (index.get(i).getItemNumber() == newItem.getItemNumber()) {
				quan = newItem.getQuantity();

				newItem.setQuantity(quan + newItem.getQuantity());

			}
			index.add(newItem);

		}
	}

	public void deleteItem(int deleteItemNumber) {
		// TODO Auto-generated method stub

	}

	public double getTotal() {
		for (int i = 0; i < index.size(); i++) {
			tote = tote + index.get(i).getUnitPrice();

		}
		return tote;
	}

	public double getTax() {
		for (int i = 0; i < index.size(); i++) {
			tax = index.get(i).getUnitPrice() * .029;

		}
		return tax;
	}

	public double getShipping() {
		for (int i = 0; i < index.size(); i++) {
			ship = ship + 10.0;
		}
		return ship;
	}

	public String toString() {
		return StringUtils.join(index, ", ");
		// String listString = String.join(" , ", index);
		/*
		 * for (int i = 0; i < index.size(); i++) { pricee = "hi"; return pricee; }
		 * return index; //"" + index.get(0).getUnitPrice() + " ... " + getShipping() +
		 * " ... " + getTax()
		 */

	}

}
