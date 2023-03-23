@HomePage
Feature: HomePage
  Checking all functionality, that related with Home Page

  # Information Template example for each Test Scenario
  #---------------------------------------------------------------------------------------------------------------------
  # Test Case ID
  # Test owner
  # Included Locals
  # Included Environments
  # Functionality Tags
  # Test Suites
  #---------------------------------------------------------------------------------------------------------------------

  #---------------------------------------------------------------------------------------------------------------------
  # Test Case ID
  # Test owner - Muslim Bairamov
  @UA
  # Included Environments
  @Searching @Brands
  # Test Suites
  #---------------------------------------------------------------------------------------------------------------------
  Scenario Outline: Searching Brands from Home Page
  Checking functionality, if we can get correct result - Searching some brand and get PLP with this brand.
    Given Open Home Page
    And Check all element headerMenu is present
    When Search "<brand>"
    Then We get PLP with this "<resultBrand>"
    #And Close Browser

  Examples:
    | brand    | resultBrand |
    | Samsung  | Samsung     |
    | Xiaomi   | Xiaomi      |
#    | Huawei   | Huawei      |
#    | Iphone   | Apple       |
#    | Sony     | Sony        |
#    | Motorola | Motorola    |
#    | Nokia    | Nokia       |
#    | OPPO     | OPPO        |
#    | Poco     | Poco        |
#    | ASUS     | ASUS        |
