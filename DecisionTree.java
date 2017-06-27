class DecisionTree {
  public String mName;
  public boolean mSnooze;
  public boolean mShower;
  public int mTimeLoss;
  public boolean mCoffee;
  public boolean mNeighbor;
  public boolean mOldMan;
  public boolean mBusActivity;
  public boolean mBagel;



  public DecisionTree(String name) {
    mName = name;
    mTimeLoss = 0;
  }

  public void pickSnooze(int choice) {
    if (choice == 1) {
      mSnooze = true;
      mTimeLoss += 1;
    } else { mSnooze = false;}
  }
  public void pickShower(int choice) {
    if (choice == 1) {
      mShower = true;
      mTimeLoss += 2;
    } else {mShower = false; }  }

  public void pickCoffee(int choice) {
    if (choice == 1) {
      mCoffee = true;
      mTimeLoss += 2;
    } else {mCoffee = false; }
  }
  public void pickNeighbor(int choice) {
    if (choice == 1) {
      mNeighbor = true;
      mTimeLoss += 1;
    } else {mNeighbor = false; }
  }
  public void pickOldMan(int choice) {
    if (choice == 1) {
      mOldMan = true;
      mTimeLoss += 2;
    } else {mOldMan = false; }
  }
  public void pickBusActivity(int choice) {
    if (choice == 1) {
      mBusActivity = true;
      mTimeLoss += 3;
    } else {mBusActivity = false; }
  }
  public void pickBagel(int choice) {
    if (choice == 1) {
      mBagel = true;
      mTimeLoss += 1;
    } else {mBagel = false; }
  }
}
