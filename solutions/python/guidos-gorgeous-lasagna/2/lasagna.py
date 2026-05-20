EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

# [✅] TODO (student): complete the 'bake_time_remaining()' function below.
def bake_time_remaining(elapsed_bake_time):
    """calculate the remaining amount of baking time 

    Parameters: 
        elapsed_bake_time(int): how long has already passed

    Returns: 
        int: An integer value representing the remaining time in minutes

    This function takes an elapsed_bake_time parameter, and uses that in combination with
    the EXPECTED_BAKE_TIME(int) constant defined at the top of the file to calculate the 
    remaining amount of time for the baking of the lasagne

    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time

#[✅] TODO (student): Define the 'preparation_time_in_minutes()' function below.
def preparation_time_in_minutes(number_of_layers):
    """calculate the remaining amount of baking time 

    Parameters: 
        number_of_layers(int): The number of layers in the lasagna.

    Returns: 
        int: An integer value representing the preparationtime in minutes

    This function takes an number_of_layers integer parameter and calculates how long the
    lasagne takes to prepare based off the number of layers and the layer preparation time

    """
    return number_of_layers * PREPARATION_TIME

#[✅] TODO (student): define the 'elapsed_time_in_minutes()' function below.
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """calculate how long the whole process has taken

    Parameters: 
        number_of_layers(int): The number of layers in the lasagna.
        number_of_layers(int): How long the baking has taken so far

    Returns: 
        int: An integer value representing the total elapsed time of preparation and 
        baking in minutes

    This function takes two int parameters, number_of_layers, elapsed_bake_time and uses 
    both to calculate the amount of time the whole process has taken so far. 
    The function reuses a function preparation_time_in_minutes to promote DRY.

    """
    return (preparation_time_in_minutes(number_of_layers)) + elapsed_bake_time