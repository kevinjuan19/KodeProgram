/**
 * @author Kevin Juan(1972002)
 */
public class WareHouseManager {
    private WareHouse wh;
    public WareHouseManager(WareHouse wareHouse){
        this.wh = wareHouse;
    }
    public void addItemToWareHouse(Item item){
        wh.addItemToList(item);
    }
    public  void viewItemInWareHouse(){
        wh.showAllItemData();
    }
}
