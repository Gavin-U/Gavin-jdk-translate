package com.sun.tools.jdi.resources;

import java.util.ListResourceBundle;

public final class jdi_ja extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "false", "false" },
            { "generic_attaching.address", "VM\u306B\u63A5\u7D9A\u3059\u308B\u30A2\u30C9\u30EC\u30B9" },
            { "generic_attaching.address.label", "\u30A2\u30C9\u30EC\u30B9" },
            { "generic_attaching.timeout", "\u63A5\u7D9A\u3092\u5F85\u3064\u9593\u306E\u30BF\u30A4\u30E0\u30A2\u30A6\u30C8 " },
            { "generic_attaching.timeout.label", "\u30BF\u30A4\u30E0\u30A2\u30A6\u30C8" },
            { "generic_listening.address", "VM\u3078\u306E\u63A5\u7D9A\u3092\u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u30A2\u30C9\u30EC\u30B9" },
            { "generic_listening.address.label", "\u30A2\u30C9\u30EC\u30B9" },
            { "generic_listening.timeout", "\u63A5\u7D9A\u3092\u5F85\u3064\u9593\u306E\u30BF\u30A4\u30E0\u30A2\u30A6\u30C8" },
            { "generic_listening.timeout.label", "\u30BF\u30A4\u30E0\u30A2\u30A6\u30C8" },
            { "memory_attaching.description", "\u5171\u6709\u30E1\u30E2\u30EA\u30FC\u3067\u305D\u306E\u4ED6\u306EVM\u306B\u63A5\u7D9A\u3057\u307E\u3059" },
            { "memory_attaching.name", "VM\u3078\u306E\u63A5\u7D9A\u306B\u4F7F\u7528\u3055\u308C\u308B\u5171\u6709\u30E1\u30E2\u30EA\u30FC\u9818\u57DF\u540D" },
            { "memory_attaching.name.label", "\u540D\u524D" },
            { "memory_listening.description", "\u305D\u306E\u4ED6\u306EVM\u306B\u3088\u308A\u958B\u59CB\u3055\u308C\u308B\u5171\u6709\u30E1\u30E2\u30EA\u30FC\u63A5\u7D9A\u3092\u53D7\u3051\u5165\u308C\u307E\u3059" },
            { "memory_listening.name", "VM\u3078\u306E\u63A5\u7D9A\u3092\u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u305F\u3081\u306E\u5171\u6709\u30E1\u30E2\u30EA\u30FC\u9818\u57DF\u540D" },
            { "memory_listening.name.label", "\u540D\u524D" },
            { "memory_transportservice.description", "\u5171\u6709\u30E1\u30E2\u30EA\u30FC\u63A5\u7D9A\u3067\u30C7\u30D0\u30C3\u30AC\u3068\u30BF\u30FC\u30B2\u30C3\u30C8\u3092\u63A5\u7D9A\u3057\u307E\u3059" },
            { "process_attaching.description", "\u30C7\u30D0\u30C3\u30B0\u3059\u308B\u30D7\u30ED\u30BB\u30B9\u306B\u30D7\u30ED\u30BB\u30B9ID (pid)\u3092\u4F7F\u7528\u3057\u3066\u63A5\u7D9A\u3057\u307E\u3059" },
            { "process_attaching.pid", "pid" },
            { "process_attaching.pid.label", "\u30C7\u30D0\u30C3\u30B0\u3059\u308B\u30D7\u30ED\u30BB\u30B9ID (pid)" },
            { "raw.address", "raw\u30B3\u30DE\u30F3\u30C9\u5B9F\u884C\u5F8C\u306B\u63A5\u7D9A\u3092\u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u30A2\u30C9\u30EC\u30B9" },
            { "raw.address.label", "\u30A2\u30C9\u30EC\u30B9" },
            { "raw.command", "\u30C7\u30D0\u30C3\u30B0\u3059\u308B\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3VM\u3092\u8D77\u52D5\u3055\u305B\u308Braw\u30B3\u30DE\u30F3\u30C9" },
            { "raw.command.label", "\u30B3\u30DE\u30F3\u30C9" },
            { "raw.description", "\u30E6\u30FC\u30B6\u30FC\u304C\u6307\u5B9A\u3057\u305F\u30B3\u30DE\u30F3\u30C9\u884C\u3092\u4F7F\u7528\u3057\u3066\u30BF\u30FC\u30B2\u30C3\u30C8\u3092\u8D77\u52D5\u3057\u3001\u63A5\u7D9A\u3057\u307E\u3059" },
            { "raw.quote", "\u5358\u4E00\u306E\u30B3\u30DE\u30F3\u30C9\u884C\u5F15\u6570\u5185\u306B\u30B9\u30DA\u30FC\u30B9\u3067\u533A\u5207\u3089\u308C\u305F\u30C6\u30AD\u30B9\u30C8\u3092\u7D50\u3073\u4ED8\u3051\u308B\u305F\u3081\u306B\u4F7F\u7528\u3055\u308C\u308B\u6587\u5B57" },
            { "raw.quote.label", "\u5F15\u7528\u7B26" },
            { "socket_attaching.description", "\u30BD\u30B1\u30C3\u30C8\u3067\u305D\u306E\u4ED6\u306EVM\u306B\u63A5\u7D9A\u3057\u307E\u3059" },
            { "socket_attaching.host", "VM\u306B\u63A5\u7D9A\u3059\u308B\u30DE\u30B7\u30F3\u540D" },
            { "socket_attaching.host.label", "\u30DB\u30B9\u30C8" },
            { "socket_attaching.port", "VM\u306B\u63A5\u7D9A\u3059\u308B\u30DD\u30FC\u30C8\u756A\u53F7" },
            { "socket_attaching.port.label", "\u30DD\u30FC\u30C8" },
            { "socket_listening.description", "\u305D\u306E\u4ED6\u306EVM\u306B\u3088\u308A\u958B\u59CB\u3055\u308C\u308B\u30BD\u30B1\u30C3\u30C8\u63A5\u7D9A\u3092\u53D7\u5165\u308C\u307E\u3059" },
            { "socket_listening.localaddr", "\u30EA\u30B9\u30CA\u30FC\u306E\u30D0\u30A4\u30F3\u30C9\u5148\u30ED\u30FC\u30AB\u30EB\u30FB\u30A2\u30C9\u30EC\u30B9" },
            { "socket_listening.localaddr.label", "\u30ED\u30FC\u30AB\u30EB\u30FB\u30A2\u30C9\u30EC\u30B9" },
            { "socket_listening.port", "VM\u3078\u306E\u63A5\u7D9A\u3092\u30EA\u30B9\u30CB\u30F3\u30B0\u3059\u308B\u30DD\u30FC\u30C8\u756A\u53F7" },
            { "socket_listening.port.label", "\u30DD\u30FC\u30C8" },
            { "socket_transportservice.description", "TCP\u63A5\u7D9A\u3067\u30C7\u30D0\u30C3\u30AC\u3068\u30BF\u30FC\u30B2\u30C3\u30C8\u3092\u63A5\u7D9A\u3057\u307E\u3059" },
            { "sun.description", "Sun\u306EJava VM\u30B3\u30DE\u30F3\u30C9\u884C\u3092\u4F7F\u7528\u3057\u3066\u30BF\u30FC\u30B2\u30C3\u30C8\u3092\u8D77\u52D5\u3057\u3001\u63A5\u7D9A\u3057\u307E\u3059" },
            { "sun.home", "SDK\u306E\u30DB\u30FC\u30E0\u30FB\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u307E\u305F\u306F\u3001\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u306E\u8D77\u52D5\u306B\u4F7F\u7528\u3055\u308C\u308B\u5B9F\u884C\u74B0\u5883" },
            { "sun.home.label", "\u30DB\u30FC\u30E0 " },
            { "sun.init_suspend", "\u30E1\u30A4\u30F3\u306E\u5B9F\u884C\u524D\u306B\u3059\u3079\u3066\u306E\u30B9\u30EC\u30C3\u30C9\u304C\u4E2D\u65AD\u3055\u308C\u307E\u3059\u3002" },
            { "sun.init_suspend.label", "\u4E2D\u65AD" },
            { "sun.main", "\u30E1\u30A4\u30F3\u30FB\u30AF\u30E9\u30B9\u3068\u5F15\u6570\u3001\u307E\u305F\u306F-jar\u304C\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5834\u5408\u306B\u306F\u30E1\u30A4\u30F3jar\u30D5\u30A1\u30A4\u30EB\u3068\u5F15\u6570" },
            { "sun.main.label", "\u30E1\u30A4\u30F3" },
            { "sun.options", "\u8D77\u52D5\u3059\u308BVM\u306E\u30AA\u30D7\u30B7\u30E7\u30F3" },
            { "sun.options.label", "\u30AA\u30D7\u30B7\u30E7\u30F3" },
            { "sun.quote", "\u5358\u4E00\u306E\u30B3\u30DE\u30F3\u30C9\u884C\u5F15\u6570\u5185\u306B\u30B9\u30DA\u30FC\u30B9\u3067\u533A\u5207\u3089\u308C\u305F\u30C6\u30AD\u30B9\u30C8\u3092\u7D50\u3073\u4ED8\u3051\u308B\u305F\u3081\u306B\u4F7F\u7528\u3055\u308C\u308B\u6587\u5B57" },
            { "sun.quote.label", "\u5F15\u7528\u7B26" },
            { "sun.vm_exec", "Java VM\u8D77\u52D5\u30C4\u30FC\u30EB\u540D" },
            { "sun.vm_exec.label", "\u8D77\u52D5\u30C4\u30FC\u30EB" },
            { "true", "true" },
            { "version_format", "Java Debug Interface(\u30EA\u30D5\u30A1\u30EC\u30F3\u30B9\u5B9F\u88C5)\u30D0\u30FC\u30B8\u30E7\u30F3{0}.{1}\n{2}" },
        };
    }
}
