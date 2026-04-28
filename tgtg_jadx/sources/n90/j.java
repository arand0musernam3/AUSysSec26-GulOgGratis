package n90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f30778h;

    public j(boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2, boolean z15, a aVar) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f30771a = z11;
        this.f30772b = z12;
        this.f30773c = z13;
        this.f30774d = z14;
        this.f30775e = str;
        this.f30776f = str2;
        this.f30777g = z15;
        this.f30778h = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f30771a + ", ignoreUnknownKeys=" + this.f30772b + ", isLenient=" + this.f30773c + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f30774d + ", prettyPrintIndent='" + this.f30775e + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f30776f + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f30777g + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f30778h + ')';
    }

    public j() {
        this(0);
    }

    public /* synthetic */ j(int i11) {
        this(false, false, false, true, "    ", "type", true, a.POLYMORPHIC);
    }
}
