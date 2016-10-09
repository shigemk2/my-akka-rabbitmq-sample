package com.example

import akka.actor.ActorSystem
import com.rabbitmq.client.ConnectionFactory
import com.github.sstone.amqp.{ChannelOwner, ConnectionOwner, Amqp}
import com.rabbitmq.client.AMQP.Queue
import com.github.sstone.amqp.Amqp._

import scala.concurrent.duration._

object Hello {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val connFactory = new ConnectionFactory()
    connFactory.setUri("amqp://guest:guest@localhost/%2F")
    val conn = system.actorOf(ConnectionOwner.props(connFactory, 1 second))
    val channel = ConnectionOwner.createChildActor(conn, ChannelOwner.props())

    channel ! DeclareQueue(QueueParameters("my_queue", passive = false, durable = false, exclusive = false, autodelete = true))
  }
}
