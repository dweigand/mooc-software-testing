#%%
class RomanNumeral():
    values = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000,
    }

    def __init__(self, roman_number:str):
        assert set(roman_number).issubset(set(self.values))
        self.roman_number = roman_number

    def convert_arabic(self):
        result = 0
        for i, s in enumerate(self.roman_number):
            if i < len(self.roman_number)-1:
                n = self.roman_number[i+1]
                n = self.values[n]
            else:
                n = 0
            
            if self.values[s] <= n:
                result -= self.values[s]
            else:
                result += self.values[s]
        return result


#%%
r = "LIX"
print([i for i in r])


# %%
