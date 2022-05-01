package ifal.cantina;

public class Produtos {
    private String name;
    private String description;
    private double buyPrice;
    private double sellPrice;
    private int amountBought;
    private int availableAmount;
    private int amountSold;

    public Produtos(String name, String description, double buyPrice, double sellPrice, int amountBought){
        // Verifico se os valores são válidos antes de cadastrar no estoque
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.amountBought =  amountBought;
        this.availableAmount = amountBought;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getAmountBought() {
        return amountBought;
    }

    public void setAmountBought(int amountBought) {
        this.amountBought = amountBought;
    }

    public void sellItem(int amount){
    	if (this.availableAmount >= amount ) {
    		this.availableAmount -= amount;
    		this.amountSold += amount;
    		this.toString();
    	}
    	else {
    		System.out.println("Quantidade Indisponivel.");
    	}
        
    }


    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String QtdeNome(){
        return "Nome: " + getName() + " Quantidade Disponivel: " + getAvailableAmount();
    }

    @Override
    public String toString(){
        String word = "";
        word += "Nome: "+ getName() + "\n";
        word += "Descricao: " + getDescription() + "\n";
        word += "Quantidade disponivel: " + getAvailableAmount();
        return word;
    }
}
