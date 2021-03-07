object WallService {
    private var posts = emptyArray<Post>()

    fun add(newPost: Post): Post {
        if (posts.isNotEmpty()) {
            newPost.id = posts.lastIndex + 2
        } else
            newPost.id = 1
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