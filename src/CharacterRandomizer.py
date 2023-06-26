import json
import random
import urllib.request

url = 'https://mapi.mobilelegends.com/hero/list?language=en'

response = urllib.request.urlopen(url)
data = json.loads(response.read())

#characters = {}
#for i, character in enumerate(data['characters']):
#    characters[i+1] = character['name']
#
#random_number = random.randint(1, len(characters))
#selected_character = characters[random_number]
#
#print(f"The randomly selected character is {selected_character}.")
print(data)