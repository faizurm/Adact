Feature: verifying booking room

  Scenario Outline: verifying booking a room with many required inputs
    Given user navigated to adact application
    When user enters "<userName>" and "<password>"
    And user whould click logIn button
    And user should verify he has entered into Welcome page
    Then User Selects the "<location>", "<hotel>", "<roomType>", "<noOfRooms>", "<inDate>", "<outDate>", "<adulPerRoom>", "<chiPerRoom>"
    And user should verify he is in select hotel page
    When user selects the hotel
    And user should verify he entered in book a hotel page
    When user enters his personnel details "<firstName>", "<lastName>", "<biilingAdd>", "<creditCardNo>", "<cardType>", "<expiryMonth>",  "<expiryYear>", "<cvv>"
    When user click book now
    Then User is getting order no
    Then User cancels his booking

    Examples: 
      | userName  | password  | location | hotel       | roomType | noOfRooms | inDate     | outDate    | adulPerRoom | chiPerRoom | firstName | lastName | biilingAdd | creditCardNo     | cardType    | expiryMonth | expiryYear | cvv |
      | samsamsam | samsamsam | Sydney   | Hotel Creek | Standard | 2 - Two   | 27/02/2020 | 29/02/2020 | 1 - One     | 2 - Two    | sam       | Tom      | HonkKong   | 7652437571546666 | Master Card | January     |       2022 | 111 |
