fun main() {

    val firstPost = Post(
        0,
        10,
        10,
        10,
        60,
        "Всем привет!",
        10,
        143,
        true,
        Comments(100, canPost = true, groupsCamPost = true, canClose = true, canOpen = true),
        Copyright(144,"Link", "Name", "Sport"),
        Likes(300, userLikes = true, canLike = false, canPublish = true),
        Reposts(50,true),
        Views(400),
        "post",
        143,
        true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 123
    )

    val secondPost = Post(
        0,
        10,
        10,
        10,
        60,
        "Как дела?",
        10,
        143,
        true,
        Comments(100,groupsCamPost = true, canClose = true, canOpen = true, canPost = true),
        Copyright(144,"Link", "Name", "Sport"),
        Likes(300, userLikes = true, canLike = false, canPublish = true),
        Reposts(50,true),
        Views(400),
        "post",
        143,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 123
    )

    val thirdPost = Post(
        1,
        10,
        10,
        10,
        60,
        "Я сделал дз",
        10,
        143,
        true,
        Comments(100,groupsCamPost = true, canClose = true, canOpen = true, canPost = true),
        Copyright(144,"Link", "Name", "Sport"),
        Likes(300, userLikes = true, canLike = false, canPublish = true),
        Reposts(50,true),
        Views(400),
        "post",
        143,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 123
    )



    WallService.add(firstPost)
    WallService.add(secondPost)
    print(WallService.update(thirdPost))

}