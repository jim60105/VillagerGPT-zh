# VillagerGPT

原版: [https://modrinth.com/plugin/villagergpt](https://modrinth.com/plugin/villagergpt)

## 和原版的不同

- Completely translate into Chinese, including UI messages and prompts.  
  完全翻譯為中文，包含訊息和提示詞
- 支援 OpenAI 相容 API，例如 Azure OpenAI (by [AidanTheBandit](https://github.com/AidanTheBandit/VillagerGPT/commit/d34d9f910a7a39422219346fc35744e580733327))
- 升級專案以配合 Minecraft 1.20.6
- 由於 1.20.6 版本棄用 NBT tag 改用 component，而 GPT 現在無法正確的產生 component 式的物品附加資訊
  - 禁止交易附魔工具、附魔書
  - 禁止出售藏寶地圖
- 交易項目改為正面列表，以增強回應的穩定性
- 可以和「無業」及「傻子」交談，但無法進行交易
- 在 config 中添加客製化話題，讓 AI 符合你的世界觀設定
- 當 AI 回應中包含連結時能點擊開啟，適合在多人伺服器中用做宣傳
- 預設值是允許所有人執行指令！ (包含非管理員)

## 簡介

VillagerGPT 為您伺服器中的村民注入新生命，讓玩家可以使用 OpenAI 技術與他們交談和進行交易。  
玩家可以與任何村民對話，討價還價，或者提出先前不可能的交易。

AI 村民們能了解自己身處的世界、玩家的聲譽，且根據其職業和隨機分配的個性進行扮演。

## 範例

![2024-06-10-214116](https://github.com/jim60105/VillagerGPT/assets/16995691/c58a765c-0ec4-4a8a-91fb-0a2fe17dc6f5)

當 AI 回應中包含連結時可以點擊開啟

![2024-06-10-214124](https://github.com/jim60105/VillagerGPT/assets/16995691/cbcbbf02-39e8-47ad-adc7-5bed2e68f2de)

---

(我在 config 中設定他們敬仰公主)  
AI 依照設定和玩家互動，並產生交易清單

![2024-06-10-214514](https://github.com/jim60105/VillagerGPT/assets/16995691/8d513163-5e60-4aa2-bdfe-34f5332f2d95)
![2024-06-10-214529](https://github.com/jim60105/VillagerGPT/assets/16995691/2b87cc37-939d-4173-bde6-e99d9696f74c)

## 使用方法

與村民開始對話，請使用指令「/ttv」然後右鍵點擊您想要交談的村民。  
一旦對話開始，只需發送聊天訊息即可繼續對話。   
使用「/ttvend」結束對話，或者直接走離該村民。

當 AI 村民提出交易時，您可以像平常一樣打開右鍵點擊該村民，並進行交易。

## AI 村民

AI 村民可以獲取以下資訊：

- 世界資訊
  - 所在生態系
  - 時間
  - 天氣
- 玩家資訊
  - 使用者名稱
  - [聲望分數](https://minecraft.fandom.com/wiki/Villager#Gossiping)
- 村民資訊
  - 名字（包括自定義名稱）
  - 職業

他們可以在回應中執行以下操作：

- 提出交易
- 搖頭
- 播放各種聲音

AI 村民也會隨機選擇以下其中一種性格：

- 長者：「作為村莊的長者，多年來您見證並參與了許多事情」
- 樂天派：「您是一個樂觀主義者，總是嘗試看到事物的光明面」
- 脾氣暴躁：「您是一個愛發牢騷的人，不怕直言不諱」
- 交易商：「您是一位精明的交易者，在貿易方面有豐富的經驗」
- 小丑：「您喜歡說有趣的笑話，對玩家通常很活潑」
- 嚴肅：「您嚴肅且直截了當；對於閒聊沒有太多耐心」
- 共感者：「您是一個和藹的人，對別人的情況很富同情心」
- 傻子：「您是一個愚蠢的人，經常說出奇怪的話，但總是讓人開心」 (職業為傻子時總是此性格)
- 未知：「您的性格未被定義，您可以自己決定您的性格」 (讓 AI 自行發揮)

## 設定

config.yml

```yml
# Obtain a key here: https://platform.openai.com
openai-key: "sk-OPENAI_API_KEY"

# This is the root URL that will be used for all API requests to OpenAI.
# The URL can include a base path, but in that case, the base path should always end with a /.
# The default value works with OpenAI API.
openai-url: "https://api.openai.com/v1/"
openai-query-param: ""
openai-headers: ""

## Example for Azure OpenAI with gpt-4o
# openai-url: "https://CHANGETHIS.openai.azure.com/openai/deployments/gpt-4o/"
# openai-query-param: "api-version=2024-02-15-preview"
# openai-headers: "api-key=changethiskey1231231"

openai-model: "gpt-4o"

# Log conversation messages to server console, useful for catching abuse
log-conversations: true

# Either "system" or "user"; configures the type of message the "preamble"
# will be. "user" is more likely to work with GPT-3.5
preamble-message-type: system

# Customizing the topic for AI chatting, please write a YAML list with line breaks using \n "IN CHINESE".
topics: "\n"
```

### openai-key

在此獲取 API 金鑰  
[https://platform.openai.com/](https://platform.openai.com/)

### openai-model

強烈建議您使用 GPT-4o 而不是 GPT-3.5  
GPT-4o 在遵循 system prompt 方面明顯優於 GPT-3.5

在此確認所有可用的模型清單  
[https://platform.openai.com/docs/models](https://platform.openai.com/docs/models)

### topics

自訂村民的話題，請撰寫 yml 清單，以 `\n` 換行

範例:

```env
topics: "- 您居住在紅葉王國\n- 您敬仰的紅葉精靈小公主，她的全名是 花咲くれは，愛稱是れれ, rere 或是 小公主\n- 花咲くれは 的 Youtube https://www.youtube.com/@kureha_1130 \n- 紅葉王國大新聞\n  - れれ小公主辦了第一場演唱會\n  - れれ小公主覺得終界箱很酷\n"
```

## 指令

- `/ttv`: 與村民開始對話
- `/ttvclear`: 清除當前村民對話
- `/ttvend`: 結束當前村民對話

> [!NOTE]  
> ttv = talk to villager

## 權限

> [!CAUTION]  
> 預設允許所有人(非管理員)執行指令！

- `villagergpt.ttv`：允許使用 `/ttv` 命令
- `villagergpt.ttvclear`：允許使用 `/ttvclear` 命令
- `villagergpt.ttvend`：允許使用 `/ttvend` 命令
