package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import x90.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f32644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(b bVar) {
        super("stream was reset: " + bVar);
        bVar.getClass();
        this.f32644a = bVar;
    }
}
