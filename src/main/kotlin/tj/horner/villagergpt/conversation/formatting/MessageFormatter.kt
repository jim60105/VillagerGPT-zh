package tj.horner.villagergpt.conversation.formatting

import java.util.logging.Logger
import java.util.regex.Pattern
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Villager

object MessageFormatter {
    fun formatMessageFromPlayer(message: Component, villager: Villager): Component {
        return formatMessage(message, playerComponent(), villagerComponent(villager))
    }

    fun formatMessageFromVillager(message: TextComponent, villager: Villager): TextComponent {
        return formatMessage(message, villagerComponent(villager), playerComponent())
    }

    private fun formatMessage(
            message: Component,
            sender: Component,
            recipient: Component
    ): TextComponent {
        return Component.text()
                .content("")
                .append(sender)
                .append(Component.text(" → ").color(NamedTextColor.WHITE))
                .append(recipient)
                .append(Component.text(": "))
                .append(message)
                .build()
    }

    fun clickableLink(
            formattedMessage: TextComponent,
            message: String,
            logger: Logger
    ): TextComponent {
        // Regex pattern for extracting URLs based on RFC 3986
        var pattern =
                Pattern.compile(
                        "\\b(?:https?|ftp):\\/\\/[-A-Z0-9+&@#\\/%?=~_|!:,.;]*[-A-Z0-9+&@#\\/%=~_|]",
                        Pattern.CASE_INSENSITIVE
                )
        var matcher = pattern.matcher(message)

        if (!matcher.find()) {
            return formattedMessage
        }
        var link = matcher.group(0)

        logger.warning("Found URL: ${link}")

        return formattedMessage
                .clickEvent(ClickEvent.openUrl(link))
                .hoverEvent(HoverEvent.showText(Component.text("請自行判斷 AI 提供的網址是否安全！")))
    }

    private fun playerComponent(): Component {
        return Component.text("你").color(NamedTextColor.DARK_AQUA)
    }

    private fun villagerComponent(villager: Villager): Component {
        return villager.name().color(NamedTextColor.AQUA)
    }
}
