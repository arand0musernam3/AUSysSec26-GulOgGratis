package kotlin.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f26604d = new g(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f26605e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f26607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f26608c;

    static {
        e eVar = f.f26599a;
        eVar.getClass();
        f fVar = f.f26600b;
        h hVar = i.f26601b;
        hVar.getClass();
        i iVar = i.f26602c;
        f26605e = new j(false, fVar, iVar);
        eVar.getClass();
        hVar.getClass();
        new j(true, fVar, iVar);
    }

    public j(boolean z11, f fVar, i iVar) {
        fVar.getClass();
        iVar.getClass();
        this.f26606a = z11;
        this.f26607b = fVar;
        this.f26608c = iVar;
    }

    public final String toString() {
        StringBuilder sbO = b3.i.o("HexFormat(\n    upperCase = ");
        sbO.append(this.f26606a);
        sbO.append(",\n    bytes = BytesHexFormat(\n");
        this.f26607b.a("        ", sbO);
        sbO.append('\n');
        sbO.append("    ),");
        sbO.append('\n');
        sbO.append("    number = NumberHexFormat(");
        sbO.append('\n');
        this.f26608c.a("        ", sbO);
        sbO.append('\n');
        sbO.append("    )");
        sbO.append('\n');
        sbO.append(")");
        return sbO.toString();
    }
}
