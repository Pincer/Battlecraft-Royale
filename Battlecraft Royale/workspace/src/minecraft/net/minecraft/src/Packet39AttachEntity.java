// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet39AttachEntity extends Packet
{

    public Packet39AttachEntity()
    {
    }

    public int getPacketSize()
    {
        return 8;
    }

    public void readPacketData(DataInputStream datainputstream)
        throws IOException
    {
        entityId = datainputstream.readInt();
        vehicleEntityId = datainputstream.readInt();
    }

    public void writePacketData(DataOutputStream dataoutputstream)
        throws IOException
    {
        dataoutputstream.writeInt(entityId);
        dataoutputstream.writeInt(vehicleEntityId);
    }

    public void processPacket(NetHandler nethandler)
    {
        nethandler.func_6497_a(this);
    }

    public int entityId;
    public int vehicleEntityId;
}
