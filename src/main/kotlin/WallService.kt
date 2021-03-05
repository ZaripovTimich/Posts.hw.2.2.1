class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId: Int = 1

    fun add(newPost: Post): Post {
        if (posts.isNotEmpty())
            for (post in posts) {
                if (post.id == newPost.id || newPost.id == 0) {
                    uniqueId++
                    newPost.id = uniqueId
                }
            }
        else
            newPost.id = uniqueId
        posts += newPost
        return posts.last()
    }

    fun update(currentPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == currentPost.id) {
                posts[index] = currentPost
                return true
            }
        }
        return false
    }
}