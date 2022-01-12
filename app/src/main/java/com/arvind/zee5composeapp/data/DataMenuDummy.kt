package com.arvind.zee5composeapp.data

object DataMenuDummy {

    val menuItems = MenuItems(
        id = 1,
        "Buy Plan"
    )

    val menuList = listOf(
        menuItems,
        menuItems.copy(
            id = 2,
            title = "My Subscription",
        ),
        menuItems.copy(
            id = 3,
            title = "My Rentals",
        ),
        menuItems.copy(
            id = 4,
            title = "My Transaction",
        ),
        menuItems.copy(
            id = 5,
            title = "Watchlist",
        ),
        menuItems.copy(
            id = 6,
            title = "Activate TV",
        ),
        menuItems.copy(
            id = 7,
            title = "Have a Prepaid Code.?",
        ),
        menuItems.copy(
            id = 8,
            title = "Settings",
        ),
        menuItems.copy(
            id = 9,
            title = "Invite a Friend",
        ),
        menuItems.copy(
            id = 10,
            title = "About Us",
        ),
        menuItems.copy(
            id = 11,
            title = "Help Center",
        ),
        menuItems.copy(
            id = 12,
            title = "Grievance Redressal",
        ),
        menuItems.copy(
            id = 13,
            title = "Logout",
        ),


        )
}