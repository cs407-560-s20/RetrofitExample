package com.example.retrofitexample

import com.google.gson.annotations.SerializedName

data class UserData(
    val results: List<User>
)

data class User(
    val gender: String,
    val name: Names,
    val email: String,
    // If you want to give a different variable name (different than what is in the received data),
    // you need to use @SerializedName, otherwise you can simply give the same variable name
    @SerializedName("picture") val imageUrl: Picture
)

data class Names(
    val title: String,
    val first: String,
    val last: String
)

data class Picture(
    val medium: String
)



// Copied and pasted a sample response below to make it easier to write data class above
/*

{
    "results": [
    {
        "gender": "female",
        "name": {
        "title": "Ms",
        "first": "Juanita",
        "last": "Williams"
    },
        "location": {
        "street": {
        "number": 1924,
        "name": "Paddock Way"
    },
        "city": "Nampa",
        "state": "North Carolina",
        "country": "United States",
        "postcode": 41272,
        "coordinates": {
        "latitude": "66.0758",
        "longitude": "9.0306"
    },
        "timezone": {
        "offset": "+2:00",
        "description": "Kaliningrad, South Africa"
    }
    },
        "email": "juanita.williams@example.com",
        "login": {
        "uuid": "7ff8399a-58b3-4615-b48e-bfc0839945a6",
        "username": "tinypanda945",
        "password": "lalakers",
        "salt": "ITnBfuDr",
        "md5": "944f1cf5866111a21ffe9934488d2d3c",
        "sha1": "d63a3b522019b820d5eb2c72659281ed64a2df02",
        "sha256": "a4b2410f3a3148e81a0d3b484cf57f96fdec01af6464ace382dd6d71b8941973"
    },
        "dob": {
        "date": "1988-05-23T05:22:05.322Z",
        "age": 32
    },
        "registered": {
        "date": "2002-09-11T00:09:47.839Z",
        "age": 18
    },
        "phone": "(155)-236-4175",
        "cell": "(699)-609-0744",
        "id": {
        "name": "SSN",
        "value": "884-33-4596"
    },
        "picture": {
        "large": "https://randomuser.me/api/portraits/women/54.jpg",
        "medium": "https://randomuser.me/api/portraits/med/women/54.jpg",
        "thumbnail": "https://randomuser.me/api/portraits/thumb/women/54.jpg"
    },
        "nat": "US"
    }
    ],
    "info": {
    "seed": "495f1a72d6bc8975",
    "results": 1,
    "page": 1,
    "version": "1.3"
}
}*/
