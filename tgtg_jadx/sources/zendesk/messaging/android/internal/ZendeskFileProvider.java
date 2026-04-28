package zendesk.messaging.android.internal;

import androidx.core.content.FileProvider;
import kotlin.Metadata;
import zendesk.messaging.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/ZendeskFileProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskFileProvider extends FileProvider {
    public ZendeskFileProvider() {
        super(R.xml.zendesk_files_path);
    }
}
