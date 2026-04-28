package x90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CANCEL;
    public static final b COMPRESSION_ERROR;
    public static final b CONNECT_ERROR;

    @NotNull
    public static final a Companion;
    public static final b ENHANCE_YOUR_CALM;
    public static final b FLOW_CONTROL_ERROR;
    public static final b FRAME_SIZE_ERROR;
    public static final b HTTP_1_1_REQUIRED;
    public static final b INADEQUATE_SECURITY;
    public static final b INTERNAL_ERROR;
    public static final b NO_ERROR;
    public static final b PROTOCOL_ERROR;
    public static final b REFUSED_STREAM;
    public static final b SETTINGS_TIMEOUT;
    public static final b STREAM_CLOSED;
    private final int httpCode;

    static {
        b bVar = new b("NO_ERROR", 0, 0);
        NO_ERROR = bVar;
        b bVar2 = new b("PROTOCOL_ERROR", 1, 1);
        PROTOCOL_ERROR = bVar2;
        b bVar3 = new b("INTERNAL_ERROR", 2, 2);
        INTERNAL_ERROR = bVar3;
        b bVar4 = new b("FLOW_CONTROL_ERROR", 3, 3);
        FLOW_CONTROL_ERROR = bVar4;
        b bVar5 = new b("SETTINGS_TIMEOUT", 4, 4);
        SETTINGS_TIMEOUT = bVar5;
        b bVar6 = new b("STREAM_CLOSED", 5, 5);
        STREAM_CLOSED = bVar6;
        b bVar7 = new b("FRAME_SIZE_ERROR", 6, 6);
        FRAME_SIZE_ERROR = bVar7;
        b bVar8 = new b("REFUSED_STREAM", 7, 7);
        REFUSED_STREAM = bVar8;
        b bVar9 = new b("CANCEL", 8, 8);
        CANCEL = bVar9;
        b bVar10 = new b("COMPRESSION_ERROR", 9, 9);
        COMPRESSION_ERROR = bVar10;
        b bVar11 = new b("CONNECT_ERROR", 10, 10);
        CONNECT_ERROR = bVar11;
        b bVar12 = new b("ENHANCE_YOUR_CALM", 11, 11);
        ENHANCE_YOUR_CALM = bVar12;
        b bVar13 = new b("INADEQUATE_SECURITY", 12, 12);
        INADEQUATE_SECURITY = bVar13;
        b bVar14 = new b("HTTP_1_1_REQUIRED", 13, 13);
        HTTP_1_1_REQUIRED = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
        Companion = new a();
    }

    public b(String str, int i11, int i12) {
        this.httpCode = i12;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.httpCode;
    }
}
