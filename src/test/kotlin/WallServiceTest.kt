import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val expected = 0
        val result = service.add(TestObject.firstPost)
        service.add(TestObject.secondPost)

        assertEquals(expected, result.id)
    }

    @Test
    fun update_TestFalse() {
        val service = WallService()

        service.add(TestObject.firstPost)
        service.add(TestObject.secondPost)

        val result = service.update(Post(
            3,
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

    @Test
    fun update_TestTrue() {
        val service = WallService()

        service.add(TestObject.firstPost)
        service.add(TestObject.secondPost)

        val result = service.update(Post(
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

        assertTrue(result)
    }
}
