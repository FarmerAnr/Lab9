import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// CRC Card: Item
class Item {
    private String name;
    private int quantity;
    
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// CRC Card: Receipt
class Receipt {
    private List<Item> items;
    private String receivedBy;
    private Date receivedDate;
    
    public Receipt(List<Item> items, String receivedBy, Date receivedDate) {
        this.items = new ArrayList<>(items);
        this.receivedBy = receivedBy;
        this.receivedDate = receivedDate;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public String getReceivedBy() {
        return receivedBy;
    }
    
    public Date getReceivedDate() {
        return receivedDate;
    }
}

// CRC Card: Release
class Release {
    private List<Item> items;
    private String issuedTo;
    private Date issuedDate;
    
    public Release(List<Item> items, String issuedTo, Date issuedDate) {
        this.items = new ArrayList<>(items);
        this.issuedTo = issuedTo;
        this.issuedDate = issuedDate;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public String getIssuedTo() {
        return issuedTo;
    }
    
    public Date getIssuedDate() {
        return issuedDate;
    }
}

// CRC Card: InventoryCheck
class InventoryCheck {
    private Item item;
    private int actualQuantity;
    private Date checkDate;
    
    public InventoryCheck(Item item, int actualQuantity, Date checkDate) {
        this.item = item;
        this.actualQuantity = actualQuantity;
        this.checkDate = checkDate;
    }
    
    public Item getItem() {
        return item;
    }
    
    public int getActualQuantity() {
        return actualQuantity;
    }
    
    public Date getCheckDate() {
        return checkDate;
    }
}

// CRC Card: Storekeeper
class Storekeeper {
    private String name;
    private Warehouse warehouse;
    
    public Storekeeper(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }
    
    public String getName() {
        return name;
    }
    
    public Warehouse getWarehouse() {
        return warehouse;
    }
    
    public void receiveItems(Receipt receipt) {}
    public void releaseItems(Release release) {}
    public void viewInventoryReport(Date startDate, Date endDate) {}
    public void performInventoryCheck(InventoryCheck inventoryCheck) {}
}

// CRC Card: Warehouse
class Warehouse {
    private String name;
    private List<Item> items;
    
    public Warehouse(String name, List<Item> items) {
        this.name = name;
        this.items = new ArrayList<>(items);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Item> getItems() {
        return items;
    }
}