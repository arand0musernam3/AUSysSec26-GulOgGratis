package org.bouncycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class DESExample {
    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;
    private BufferedInputStream in;
    private byte[] key;
    private BufferedOutputStream out;

    public DESExample(String str, String str2, String str3, boolean z11) {
        PrintStream printStream;
        StringBuilder sb2;
        SecureRandom secureRandom;
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z11;
        try {
            this.in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println("Input file not found [" + str + "]");
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println("Output file not created [" + str2 + "]");
            System.exit(1);
        }
        if (z11) {
            try {
                secureRandom = new SecureRandom();
            } catch (Exception unused3) {
            }
            try {
                secureRandom.setSeed("www.bouncycastle.org".getBytes());
            } catch (Exception unused4) {
                secureRandom2 = secureRandom;
                try {
                    System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                    System.exit(1);
                    secureRandom = secureRandom2;
                } catch (IOException unused5) {
                    printStream = System.err;
                    sb2 = new StringBuilder("Could not decryption create key file [");
                }
            }
            KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, BERTags.PRIVATE);
            DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
            dESedeKeyGenerator.init(keyGenerationParameters);
            this.key = dESedeKeyGenerator.generateKey();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
            byte[] bArrEncode = Hex.encode(this.key);
            bufferedOutputStream.write(bArrEncode, 0, bArrEncode.length);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
            int iAvailable = bufferedInputStream.available();
            byte[] bArr = new byte[iAvailable];
            bufferedInputStream.read(bArr, 0, iAvailable);
            this.key = Hex.decode(bArr);
            return;
        } catch (IOException unused6) {
            printStream = System.err;
            sb2 = new StringBuilder("Decryption key file not found, or not valid [");
        }
        sb2.append(str3);
        sb2.append("]");
        printStream.println(sb2.toString());
        System.exit(1);
    }

    public static void main(String[] strArr) {
        String str;
        boolean z11 = true;
        if (strArr.length < 2) {
            new DESExample();
            System.err.println("Usage: java " + DESExample.class.getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z11 = false;
        } else {
            str = "deskey.dat";
        }
        new DESExample(str2, str3, str, z11).process();
    }

    private void performDecrypt(byte[] bArr) {
        this.cipher.init(false, new KeyParameter(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.in));
        byte[] bArr2 = null;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                byte[] bArrDecode = Hex.decode(line);
                byte[] bArr3 = new byte[this.cipher.getOutputSize(bArrDecode.length)];
                int iProcessBytes = this.cipher.processBytes(bArrDecode, 0, bArrDecode.length, bArr3, 0);
                if (iProcessBytes > 0) {
                    this.out.write(bArr3, 0, iProcessBytes);
                }
                bArr2 = bArr3;
            } catch (IOException e5) {
                e5.printStackTrace();
                return;
            }
        }
        int iDoFinal = this.cipher.doFinal(bArr2, 0);
        if (iDoFinal > 0) {
            this.out.write(bArr2, 0, iDoFinal);
        }
    }

    private void performEncrypt(byte[] bArr) {
        PaddedBufferedBlockCipher paddedBufferedBlockCipher;
        this.cipher.init(true, new KeyParameter(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.cipher.getOutputSize(47)];
        while (true) {
            try {
                int i11 = this.in.read(bArr2, 0, 47);
                paddedBufferedBlockCipher = this.cipher;
                if (i11 <= 0) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                int iProcessBytes = paddedBufferedBlockCipher.processBytes(bArr2, 0, i11, bArr3, 0);
                if (iProcessBytes > 0) {
                    byte[] bArrEncode = Hex.encode(bArr3, 0, iProcessBytes);
                    this.out.write(bArrEncode, 0, bArrEncode.length);
                    this.out.write(10);
                }
            } catch (IOException e5) {
                e5.printStackTrace();
                return;
            }
        }
        int iDoFinal = paddedBufferedBlockCipher.doFinal(bArr3, 0);
        if (iDoFinal > 0) {
            byte[] bArrEncode2 = Hex.encode(bArr3, 0, iDoFinal);
            this.out.write(bArrEncode2, 0, bArrEncode2.length);
            this.out.write(10);
        }
    }

    private void process() {
        this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        boolean z11 = this.encrypt;
        byte[] bArr = this.key;
        if (z11) {
            performEncrypt(bArr);
        } else {
            performDecrypt(bArr);
        }
        try {
            this.in.close();
            this.out.flush();
            this.out.close();
        } catch (IOException e5) {
            System.err.println("exception closing resources: " + e5.getMessage());
        }
    }

    public DESExample() {
        this.encrypt = true;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
    }
}
