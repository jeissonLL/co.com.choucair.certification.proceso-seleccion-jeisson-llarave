#Autor: Jeisson Llarave
@stories
  Feature: Academy Choucair
    As  a user, I want ti learn how  to automate screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for  a automation  course
    Given than brandon wants to learn automation at the Choucair Academy
      |  strUser    | strPassword   |
      |  <strUser>  | <strPassword> |
    When he search for the course automation resources in Bancolombia on the Choucair Academy platform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called automation resources Bancolombia
      | strCourse   |
      | <strCourse> |

    Examples:
      | strUser | strPassword   | strCourse               |
      | rpenaa  | Febrero, 2020 | Methodology bamcolombia |
