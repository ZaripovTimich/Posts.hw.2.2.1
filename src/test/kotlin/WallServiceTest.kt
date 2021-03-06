import org.junit.Test

import org.junit.Assert.*
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters

@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
class WallServiceTest {

    @Test
    fun add() {

        val expected = 3

        WallService.add(Post(
            0,
            10,
            10,
            10,
            60,
            "Всем привет!",
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
        ))

        WallService.add(Post(
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
        ))

        val result = WallService.add(Post(
            0,
            10,
            10,
            10,
            60,
            "Я сделал дз",
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
        ))

        assertEquals(expected, result.id)
    }

    @Test
    fun update_TestTrue() {

        val result1 = WallService.update(Post(
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
            postponedId = 123))

        assertTrue(result1)
    }

    @Test
    fun update_TestFalse() {

        val result = WallService.update(Post(
            4,
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
            postponedId = 123))

        assertFalse(result)
    }


}
