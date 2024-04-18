Feature: Wish List functionality

  Scenario: Ürünü favorilere ekleme ve çıkarma

    When Kullanici magento sitesine giris yapar
    Then Begendigi bir urunun sayfasına gider
    And Kullanici Favorilere Ekle butonuna tiklar
    And Urunun favorilere eklendigine dair mesaj gosterilir
    And Kullanıcı Hesabım sayfasına gider
    And Favorilerim linkine tıklar
    Then Favoriler listesinde eklediği ürünü görür
    And Kullanici urunun uzerine gittiginde delete butonunu gorur
    When Kullanici delete butonuna tıklar
    Then Kullaniciya urunun favoriler listesinden cikarildigina dair bir mesaj goruntulenir
