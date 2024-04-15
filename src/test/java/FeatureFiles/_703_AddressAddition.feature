Feature: Address addition functionality

  Scenario Outline: Başarılı şekilde adres ekleme
    Given Kullanıcı, hesabına giriş yapar
    Then Kullanıcı myaccount linkine tıklar
    And Kullanıcı, Adress Book kısmındaki Manage Address linkine tıklar
    And Kullanıcı, Add New Address linkine tıklar
    And Gerekli alanları kullanarak doldurur
      | StreetAddress   | PhoneNumber   | Country   | City   | PostalCode   |
      | <StreetAddress> | <PhoneNumber> | <Country> | <City> | <PostalCode> |
    Then Değişiklikleri kaydeder ve adreslerim sayfasına geri döner

    Examples:
      | StreetAddress | PhoneNumber | Country | PostalCode | City  |
      | 75. Yıl Mah   | 555555555   | TR      | 31080      | Hatay |
      | Harbiye Mah.  | 555555555   | TR      | 31060      | Hatay |
