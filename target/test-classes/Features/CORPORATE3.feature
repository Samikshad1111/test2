 #Author: samiksha.dongre@dhitechnologies.org
Feature: to test the scenario of create temple inventory multiple inputes 
 
  @Inventory @smoke
  Scenario Outline: To test on dashboard click on user and add user
    Given LOGIN  CORPORATE  APP AS ADMIN
    Then User redirect to dashboard
    Given Admin on dashboard
    Given on dashboard admin click on  INVENTORY
    Then admin get redirect to Inventory page
    When User click on ADD INVENTORY
    And Enter inventory Name as <inventoryname>
    And Enter inventory MODEL NUMBER as <modelno>
    And Enter inventory SERIAL NUMBER as <serialno>
    And Enter inventory  FIRMWARE NUMBER as <firmwareno>
    And Enter inventory  SSID as <ssid>
    And Enter inventory SSID PASSKEY as <ssidpasswkey>
    And Enter inventory WIFIMAC as <wifimac>
    And Enter inventory WIFIAPMAC as <wifiapmac>
    And Enter inventory BLE MAC as <blewifimac>
    And Enter inventory HARDWARE VERSION as <hardware>
    And Enter inventory  DEVICE TYPE
    And Enter inventory CHIPSET
    When admin click on add to Inventory

    Examples: 
      | Username     | Password     | status  | inventoryname | modelno | serialno        | firmwareno | ssid                               | ssidpasswkey                                                      | wifimac      | wifiapmac    | blewifimac   | hardware |  
      | dhi-samiksha | YI7M84sh!gJx | success | JHGFKJHKJH    | EC1000  | UZD0436THHCPZ1X |        0.1 | TMA59YGXX3JXYDB33NR3XNMMLFH0WL41FU | VV87510B94W48I4BYVHJFHV1318PE0BMPUN6XFDNOOMWOZACBCK0OXLIIPA1UYC7P | 955a00881JFA | 966a0088YJNG | 977a00881JFA |        1 | 
 
 
    