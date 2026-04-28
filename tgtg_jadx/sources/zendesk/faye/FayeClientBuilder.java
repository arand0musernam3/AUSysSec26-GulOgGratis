package zendesk.faye;

import cp.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.c;
import n90.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.d0;
import y9.w;
import zendesk.faye.internal.DefaultFayeClient;
import zendesk.faye.internal.OkHttpWebSocket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzendesk/faye/FayeClientBuilder;", "", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "Lq90/d0;", "okHttpClient", "withOkHttpClient", "(Lq90/d0;)Lzendesk/faye/FayeClientBuilder;", "Lzendesk/faye/FayeClientListener;", "fayeClientListener", "withListener", "(Lzendesk/faye/FayeClientListener;)Lzendesk/faye/FayeClientBuilder;", "Lzendesk/faye/FayeClient;", "build", "()Lzendesk/faye/FayeClient;", "Ljava/lang/String;", "Lq90/d0;", "Lzendesk/faye/FayeClientListener;", "Ln90/c;", "json", "Ln90/c;", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFayeClientBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FayeClientBuilder.kt\nzendesk/faye/FayeClientBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class FayeClientBuilder {

    @Nullable
    private FayeClientListener fayeClientListener;

    @NotNull
    private final c json;

    @Nullable
    private d0 okHttpClient;

    @NotNull
    private final String serverUrl;

    public FayeClientBuilder(@NotNull String str) {
        str.getClass();
        this.serverUrl = str;
        this.json = w.h(new i(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(h hVar) {
        hVar.getClass();
        hVar.f30764a = true;
        hVar.f30766c = true;
        hVar.f30765b = false;
        hVar.f30767d = true;
        return Unit.f26487a;
    }

    @NotNull
    public final FayeClient build() {
        d0 d0Var = this.okHttpClient;
        if (d0Var == null) {
            d0Var = new d0();
        }
        DefaultFayeClient defaultFayeClient = new DefaultFayeClient(this.serverUrl, new OkHttpWebSocket(d0Var), this.json);
        FayeClientListener fayeClientListener = this.fayeClientListener;
        if (fayeClientListener != null) {
            defaultFayeClient.addListener(fayeClientListener);
        }
        return defaultFayeClient;
    }

    @NotNull
    public final FayeClientBuilder withListener(@NotNull FayeClientListener fayeClientListener) {
        fayeClientListener.getClass();
        this.fayeClientListener = fayeClientListener;
        return this;
    }

    @NotNull
    public final FayeClientBuilder withOkHttpClient(@NotNull d0 okHttpClient) {
        okHttpClient.getClass();
        this.okHttpClient = okHttpClient;
        return this;
    }
}
