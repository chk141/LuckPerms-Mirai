package io.github.karlatemp.luckperms.mirai.commands

import me.lucko.luckperms.common.command.access.CommandPermission
import me.lucko.luckperms.common.plugin.LuckPermsPlugin
import me.lucko.luckperms.common.sender.Sender
import net.kyori.text.Component
import net.luckperms.api.util.Tristate
import net.mamoe.mirai.console.command.CommandSender
import java.util.*

class WrappedLPSender(
    val delegate: Sender,
    val real: CommandSender
) : Sender {
    override fun getPlugin() = delegate.plugin

    override fun getName() = delegate.name

    override fun getNameWithLocation() = delegate.nameWithLocation

    override fun getUniqueId() = delegate.uniqueId

    override fun sendMessage(message: String?) = delegate.sendMessage(message)

    override fun sendMessage(message: Component?) = delegate.sendMessage(message)

    override fun getPermissionValue(permission: String?) = delegate.getPermissionValue(permission)

    override fun hasPermission(permission: String?) = delegate.hasPermission(permission)

    override fun hasPermission(permission: CommandPermission?) = delegate.hasPermission(permission)

    override fun performCommand(commandLine: String?) = delegate.performCommand(commandLine)

    override fun isConsole() = delegate.isConsole

    override fun isValid() = delegate.isValid
}