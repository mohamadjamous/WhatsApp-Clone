package com.example.whatsapp_clone.data.local

import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.data.model.Call
import com.example.whatsapp_clone.data.model.Chat
import com.example.whatsapp_clone.data.model.Conversation
import com.example.whatsapp_clone.data.model.Status

val calls = mutableListOf<Call>().apply {
    add(
        Call(
            "Chris Hemsworth",
            "https://media.gqmagazine.fr/photos/665488d44c7a6d119fc49211/1:1/w_1600%2Cc_limit/HemsworthFuriosa.jpg",
            "Yesterday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Robert Downey Jr.",
            "https://cdn.britannica.com/99/254199-050-98CF4E04/Robert-Downey-JR-UK-premier-Oppenheimer-movie-July-2023.jpg",
            "Friday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Scarlett Johansson",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg/800px-Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg",
            "Thursday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Mark Ruffalo",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaR6CiG2r9ZR0JuXvA_bUnwlnoRhb7AIR6Dw&s",
            "Monday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Chris Evans",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhKEvXXHKuOKiW9Ggv4ugczJ5WOf2BY1pPhw&s",
            "22/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Tom Hiddleston",
            "https://cdn.britannica.com/12/215012-050-19D71F2D/English-actor-Tom-Hiddleston-2018.jpg",
            "18/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Jeremy Renner",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYyn1lJfbthRuk54dIE7_HetcqXRIzOH3xpQ&s",
            "10/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Brie Larson",
            "https://example.com/brie_larson.jpg",
            "9/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Paul Rudd",
            "https://example.com/paul_rudd.jpg",
            "19/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Benedict Cumberbatch",
            "https://example.com/benedict_cumberbatch.jpg",
            "15/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Tom Holland",
            "https://example.com/tom_holland.jpg",
            "12/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Chadwick Boseman",
            "https://example.com/chadwick_boseman.jpg",
            "1/03/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Sebastian Stan",
            "https://example.com/sebastian_stan.jpg",
            "20/02/20",
            R.drawable.ic_down_missed
        )
    )
}

val chatsList = mutableListOf<Chat>().apply {
    add(
        Chat(
            "Chris Hemsworth",
            "https://media.gqmagazine.fr/photos/665488d44c7a6d119fc49211/1:1/w_1600%2Cc_limit/HemsworthFuriosa.jpg",
            "Hey there! How's it going?",
            "Yesterday",
            "0"
        )
    )
    add(
        Chat(
            "Robert Downey Jr.",
            "https://cdn.britannica.com/99/254199-050-98CF4E04/Robert-Downey-JR-UK-premier-Oppenheimer-movie-July-2023.jpg",
            "Looking forward to our next project!",
            "Friday",
            "0"
        )
    )
    add(
        Chat(
            "Scarlett Johansson",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg/800px-Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg",
            "Can we reschedule our meeting?",
            "Thursday",
            "2"
        )
    )
    add(
        Chat(
            "Mark Ruffalo",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaR6CiG2r9ZR0JuXvA_bUnwlnoRhb7AIR6Dw&s",
            "Let's catch up soon!",
            "Monday",
            "5"
        )
    )
    add(
        Chat(
            "Chris Evans",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/ChrisEvans2023.jpg/800px-ChrisEvans2023.jpg",
            "Sent you the files.",
            "22/04/20",
            "6"
        )
    )
    add(
        Chat(
            "Tom Hiddleston",
            "https://media.vanityfair.com/photos/66050a8578f6c8e74b372ef6/master/w_2560%2Cc_limit/1398729436",
            "Are you free tomorrow?",
            "18/04/20",
            "7"
        )
    )
    add(
        Chat(
            "Jeremy Renner",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYyn1lJfbthRuk54dIE7_HetcqXRIzOH3xpQ&s",
            "Got your message.",
            "10/04/20",
            "1"
        )
    )
    add(
        Chat(
            "Brie Larson",
            "https://example.com/brie_larson.jpg",
            "Can you share the details?",
            "9/04/20",
            "0"
        )
    )
    add(
        Chat(
            "Paul Rudd",
            "https://example.com/paul_rudd.jpg",
            "Just finished my tasks.",
            "19/03/20",
            "0"
        )
    )
    add(
        Chat(
            "Benedict Cumberbatch",
            "https://example.com/benedict_cumberbatch.jpg",
            "Let's discuss it over coffee.",
            "15/03/20",
            "2"
        )
    )
    add(
        Chat(
            "Tom Holland",
            "https://example.com/tom_holland.jpg",
            "Excited for our next shoot!",
            "12/03/20",
            "5"
        )
    )
    add(
        Chat(
            "Chadwick Boseman",
            "https://example.com/chadwick_boseman.jpg",
            "How are you holding up?",
            "1/03/20",
            "3"
        )
    )
    add(
        Chat(
            "Sebastian Stan",
            "https://example.com/sebastian_stan.jpg",
            "Can't wait for the weekend.",
            "20/02/20",
            "9"
        )
    )
}.toList()

val statusList = mutableListOf<Status>().apply {
    add(
        Status(
            "Chris Hemsworth",
            "https://media.gqmagazine.fr/photos/665488d44c7a6d119fc49211/1:1/w_1600%2Cc_limit/HemsworthFuriosa.jpg",
            "Today, 5:00 pm"
        )
    )
    add(
        Status(
            "Robert Downey Jr.",
            "https://cdn.britannica.com/99/254199-050-98CF4E04/Robert-Downey-JR-UK-premier-Oppenheimer-movie-July-2023.jpg",
            "Today, 9:00 am"
        )
    )
    add(
        Status(
            "Scarlett Johansson",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg/800px-Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg",
            "Thursday"
        )
    )
    add(
        Status(
            "Mark Ruffalo",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaR6CiG2r9ZR0JuXvA_bUnwlnoRhb7AIR6Dw&s",
            "Monday"
        )
    )
    add(
        Status(
            "Chris Evans",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/ChrisEvans2023.jpg/800px-ChrisEvans2023.jpg",
            "22/04/20"
        )
    )
    add(
        Status(
            "Tom Hiddleston",
            "https://media.vanityfair.com/photos/66050a8578f6c8e74b372ef6/master/w_2560%2Cc_limit/1398729436",
            "18/04/20"
        )
    )
    add(
        Status(
            "Jeremy Renner",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYyn1lJfbthRuk54dIE7_HetcqXRIzOH3xpQ&s",
            "10/04/20"
        )
    )
    add(
        Status(
            "Brie Larson",
            "https://example.com/brie_larson.jpg",
            "9/04/20"
        )
    )
    add(
        Status(
            "Paul Rudd",
            "https://example.com/paul_rudd.jpg",
            "19/03/20"
        )
    )
    add(
        Status(
            "Benedict Cumberbatch",
            "https://example.com/benedict_cumberbatch.jpg",
            "15/03/20"
        )
    )
    add(
        Status(
            "Tom Holland",
            "https://example.com/tom_holland.jpg",
            "12/03/20"
        )
    )
    add(
        Status(
            "Chadwick Boseman",
            "https://example.com/chadwick_boseman.jpg",
            "1/03/20"
        )
    )
    add(
        Status(
            "Sebastian Stan",
            "https://example.com/sebastian_stan.jpg",
            "20/02/20"
        )
    )
}.toList()

val chat = mutableListOf<Conversation>().apply {
    add(Conversation(1, "Did you finish the project?"))
    add(Conversation(2, "Yes, I submitted it yesterday."))
    add(Conversation(1, "Great job!"))
    add(Conversation(2, "Thank you!"))
    add(Conversation(1, "Are you free this weekend?"))
    add(Conversation(2, "Yes, let's plan something."))
    add(Conversation(1, "Sounds good!"))
    add(Conversation(2, "I'll check with others too."))
    add(Conversation(1, "Alright, let me know."))
    add(Conversation(2, "Will do!"))
    add(Conversation(1, "Take care."))
    add(Conversation(2, "You too!"))
}


fun addChat(text: String) = chat.add(Conversation(1, text))