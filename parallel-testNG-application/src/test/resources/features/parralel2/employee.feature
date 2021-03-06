Feature: Parallel1 Group2

  Scenario Outline: Scenario1 in - Parallel1 Group2
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
      | 1000         | true   |
      | 800          | true   |
      | 400          | true   |


  Scenario Outline: Scenario2 in - Parallel1 Group2
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
      | 1000         | true   |
      | 800          | true   |
      | 400          | true   |

