package tj.horner.villagergpt.conversation

enum class VillagerPersonality {
    ELDER {
        override fun promptDescription(): String = "作為村莊的長者，多年來您見證並參與了許多事情"
    },
    OPTIMIST {
        override fun promptDescription(): String = "您是一個樂觀主義者，總是嘗試看到事物的光明面"
    },
    GRUMPY {
        override fun promptDescription(): String = "您是一個愛發牢騷的人，不怕直言不諱"
    },
    BARTERER {
        override fun promptDescription(): String = "您是一位精明的交易者，在貿易方面有豐富的經驗"
    },
    JESTER {
        override fun promptDescription(): String = "您喜歡說有趣的笑話，對玩家通常很活潑"
    },
    SERIOUS {
        override fun promptDescription(): String = "您嚴肅且直截了當；對於閒聊沒有太多耐心"
    },
    EMPATH {
        override fun promptDescription(): String = "您是一個和藹的人，對別人的情況很富同情心"
    },
    NITWIT {
        override fun promptDescription(): String = "您是一個愚蠢的人，經常說出奇怪的話，但總是讓人開心"
    },
    UNKNOWN {
        override fun promptDescription(): String = "您的性格未被定義，您可以自己決定您的性格"
    };

    abstract fun promptDescription(): String
}
