package dropdown;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchdropdowns.*;

public class TestDropSelection extends CommonAPI {

    @Test
    public void TestBusiness(){
        BusinessAndIndstrial businessAndIndstrial= PageFactory.initElements (driver, BusinessAndIndstrial.class );
        businessAndIndstrial.Business ();
    }

    @Test
    public void TestCollectibles(){
        Collectibles collectibles= PageFactory.initElements (driver, Collectibles.class );
        collectibles.CollectiblesPage ();
    }

    @Test
    public void TestElectronics(){
        ConsumerElectronics consumerElectronics = PageFactory.initElements (driver, ConsumerElectronics.class );
        consumerElectronics.ElectronicsPage ();
    }

    @Test
    public void TestFashion(){
        Fashion fashion = PageFactory.initElements (driver, Fashion.class );
        fashion.FashionPage ();
    }

    @Test
    public void TestHomeGarden(){
        HomeAndGarden homeAndGarden= PageFactory.initElements (driver, HomeAndGarden.class );
        homeAndGarden.GardenPage ();

    }

    @Test
    public void TestMotors(){
        EBayMotors eBayMotors= PageFactory.initElements (driver, EBayMotors.class );
        eBayMotors.MotorPage ();

    }

    @Test
    public void TestMusic(){
        Music music = PageFactory.initElements (driver, Music.class );
        music.MusicPage ();
    }

    @Test
    public void TestSportingGoodsPage(){
        SportingGoods sportingGoods= PageFactory.initElements (driver, SportingGoods.class );
        sportingGoods.SportingPage ();

    }

    @Test
    public void TestToys(){
        ToysHobbies toysHobbies= PageFactory.initElements (driver, ToysHobbies.class );
        toysHobbies.ToysPage ();
    }

    @Test
    public void TestAllCat() {
        AllCategories allCategories = PageFactory.initElements (driver, AllCategories.class);
        allCategories.AllCatPage ();
    }
    @Test
    public void TestMusic2(){
        Music music = PageFactory.initElements (driver, Music.class );
        music.MusicPage2 ();
    }


    @Test
    public void TestAntiques() {
        Antiques antiques = PageFactory.initElements (driver, Antiques.class);
        antiques.AntiquePage ();
    }
    @Test
    public void TestArt() {
        Art art = PageFactory.initElements (driver, Art.class);
        art.ArtPage ();
    }
    @Test
    public void TestStampsPage3() {
        Stamps stamps = PageFactory.initElements (driver, Stamps.class);
        stamps.StampsPage3 ();
    }

    @Test
    public void TestMusic3(){
        Music music = PageFactory.initElements (driver, Music.class );
        music.MusicPage3 ();
    }

    @Test
    public void TestAllCat2() {
        AllCategories allCategories = PageFactory.initElements (driver, AllCategories.class);
        allCategories.AllCatPage2 ();
    }
    @Test
    public void TestBaby() {
        Baby baby = PageFactory.initElements (driver, Baby.class);
        baby.BabyPage ();
    }
    @Test
    public void Books() {
        Books books = PageFactory.initElements (driver, Books.class);
        books.BooksPage ();
    }
    @Test
    public void TestCamera() {
        CameraAndPhoto cameraAndPhoto = PageFactory.initElements (driver, CameraAndPhoto.class);
        cameraAndPhoto.CamsPage ();
    }
    @Test
    public void TestCellPage() {
        CellPhoneAndAcc cellPhoneAndAcc = PageFactory.initElements (driver, CellPhoneAndAcc.class);
        cellPhoneAndAcc.CellPage ();
    }
    @Test
    public void TestClothingPage() {
        ClothingShoesAcc clothingShoesAcc = PageFactory.initElements (driver, ClothingShoesAcc.class);
        clothingShoesAcc.ShoesPage ();
    }
    @Test
    public void TestCoinsPage() {
        CoinsAndPaperMoney coinsAndPaperMoney = PageFactory.initElements (driver, CoinsAndPaperMoney.class);
        coinsAndPaperMoney.CoinsPage ();
    }
    @Test
    public void TestComputersPage() {
       ComputersTabletsNetworking computersTabletsNetworking = PageFactory.initElements (driver, ComputersTabletsNetworking.class);
        computersTabletsNetworking.ComputersPage ();
    }
    @Test
    public void TestCrafts() {
        Crafts crafts= PageFactory.initElements (driver, Crafts.class);
        crafts.CraftsPage ();
    }
    @Test
    public void TestDolls() {
        DollsBears dollsBears = PageFactory.initElements (driver, DollsBears.class);
        dollsBears.DollsPage ();
    }
    @Test
    public void TestDVDPage() {
        DVDMovies dvdMovies = PageFactory.initElements (driver, DVDMovies.class);
        dvdMovies.DVDPage ();
    }
    @Test
    public void TestEntertainment() {
        EntertainmentMemo entertainmentMemo = PageFactory.initElements (driver, EntertainmentMemo.class);
        entertainmentMemo.EnterMemoPapge ();
    }
    @Test
    public void TestEverythingPage() {
        EverythingElse everythingElse = PageFactory.initElements (driver, EverythingElse.class);
        everythingElse.EverythingElsePage ();
    }
    @Test
    public void TestGiftCards() {
        GiftCardsCoupons giftCardsCoupons = PageFactory.initElements (driver, GiftCardsCoupons.class);
       giftCardsCoupons.GiftCardsPage ();
    }
    @Test
    public void TestHealthPage() {
        HealthBeauty healthBeauty = PageFactory.initElements (driver, HealthBeauty.class);
        healthBeauty.HealthPage ();
    }
    @Test
    public void TestJewelryPage() {
        JewelryWatches jewelryWatches = PageFactory.initElements (driver, JewelryWatches.class);
        jewelryWatches.JewelryPage ();
    }
    @Test
    public void TestMusicalInstruments() {
        MusicalInstrumentsGear musicalInstrumentsGear = PageFactory.initElements (driver, MusicalInstrumentsGear.class);
        musicalInstrumentsGear.MusicalInstruPage ();
    }
    @Test
    public void TestPetPage() {
        PetSupplies petSupplies = PageFactory.initElements (driver, PetSupplies.class);
        petSupplies.PetsPage ();
    }
    @Test
    public void TestPottery() {
        PotteryGlass potteryGlass = PageFactory.initElements (driver, PotteryGlass.class);
        potteryGlass.PotteryPage ();
    }
    @Test
    public void TestRealEstate() {
        RealEstate realEstate = PageFactory.initElements (driver, RealEstate.class);
        realEstate.RealEstatePage ();
    }
    @Test
    public void TestPetPage2() {
        PetSupplies petSupplies = PageFactory.initElements (driver, PetSupplies.class);
        petSupplies.PetsPage2 ();
    }
    @Test
    public void TestSpecialtyl() {
        SpecialtyServices specialtyServices = PageFactory.initElements (driver, SpecialtyServices.class);
        specialtyServices.SpecialtyPage ();
    }
    @Test
    public void TestSportsMemo() {
        SportsMemCards sportsMemCards = PageFactory.initElements (driver, SportsMemCards.class);
        sportsMemCards.SportsMemPage ();
    }
    @Test
    public void TestStampsPage() {
        Stamps stamps = PageFactory.initElements (driver, Stamps.class);
        stamps.StampsPage ();
    }
    @Test
    public void TestTickets() {
        TicketsExperiences ticketsExperiences = PageFactory.initElements (driver, TicketsExperiences.class);
        ticketsExperiences.TicketsPage ();
    }
    @Test
    public void TestToysHobbiesPage() {
        ToysHobbies toysHobbies = PageFactory.initElements (driver, ToysHobbies.class);
        toysHobbies.ToysPage();
    }
    @Test
    public void TestTravel() {
        Travel travel = PageFactory.initElements (driver, Travel.class);
        travel.TravelPage ();
    }
    @Test
    public void TestPetPage3() {
        PetSupplies petSupplies = PageFactory.initElements (driver, PetSupplies.class);
        petSupplies.PetsPage3 ();
    }
    @Test
    public void TestStampsPage2() {
        Stamps stamps = PageFactory.initElements (driver, Stamps.class);
        stamps.StampsPage2 ();
    }
    @Test
    public void TestVideosGames(){
        VideoGamesConsoles videoGamesConsoles = PageFactory.initElements (driver, VideoGamesConsoles.class);
        videoGamesConsoles.VideoGamingPage ();
    }


}



